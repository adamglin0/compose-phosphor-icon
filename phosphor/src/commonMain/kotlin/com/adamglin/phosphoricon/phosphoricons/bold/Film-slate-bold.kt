package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Film-slate-bold`: ImageVector
    get() {
        if (`_film-slate-bold` != null) {
            return `_film-slate-bold`!!
        }
        `_film-slate-bold` = Builder(name = "Film-slate-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 100.0f)
                lineTo(132.92f, 100.0f)
                lineToRelative(78.14f, -20.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.52f, -14.75f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, false, -24.3f, -13.95f)
                lineTo(34.79f, 60.87f)
                arcToRelative(19.74f, 19.74f, 0.0f, false, false, -12.14f, 9.27f)
                arcToRelative(19.48f, 19.48f, 0.0f, false, false, -1.95f, 15.0f)
                lineTo(28.0f, 112.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 100.0f)
                close()
                moveTo(124.89f, 61.91f)
                lineToRelative(18.29f, 10.56f)
                lineToRelative(-25.95f, 6.85f)
                lineTo(98.94f, 68.76f)
                close()
                moveTo(189.34f, 44.91f)
                lineTo(193.25f, 59.26f)
                lineTo(176.12f, 63.78f)
                lineTo(157.83f, 53.21f)
                close()
                moveTo(66.0f, 77.46f)
                lineTo(84.29f, 88.0f)
                lineToRelative(-35.4f, 9.35f)
                lineTo(45.0f, 83.0f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 124.0f)
                lineTo(204.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_film-slate-bold`!!
    }

private var `_film-slate-bold`: ImageVector? = null
