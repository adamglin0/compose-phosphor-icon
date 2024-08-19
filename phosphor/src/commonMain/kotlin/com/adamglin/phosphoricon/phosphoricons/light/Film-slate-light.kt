package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Film-slate-light`: ImageVector
    get() {
        if (`_film-slate-light` != null) {
            return `_film-slate-light`!!
        }
        `_film-slate-light` = Builder(name = "Film-slate-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 106.0f)
                lineTo(86.68f, 106.0f)
                lineTo(209.53f, 73.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.26f, -7.38f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -17.0f, -9.72f)
                lineTo(36.32f, 66.67f)
                arcToRelative(13.77f, 13.77f, 0.0f, false, false, -8.48f, 6.47f)
                arcToRelative(13.57f, 13.57f, 0.0f, false, false, -1.36f, 10.42f)
                lineTo(34.0f, 111.34f)
                curveToRelative(0.0f, 0.22f, 0.0f, 0.44f, 0.0f, 0.66f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 106.0f)
                close()
                moveTo(125.75f, 55.48f)
                lineToRelative(33.0f, 19.07f)
                lineToRelative(-42.43f, 11.2f)
                lineToRelative(-33.0f, -19.07f)
                close()
                moveTo(191.75f, 38.07f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 2.34f, 1.26f)
                lineToRelative(6.57f, 24.18f)
                lineTo(175.26f, 70.2f)
                lineToRelative(-33.0f, -19.07f)
                close()
                moveTo(38.23f, 79.14f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, 1.15f, -0.87f)
                lineTo(66.86f, 71.0f)
                lineToRelative(33.0f, 19.08f)
                lineTo(44.66f, 104.68f)
                lineToRelative(-6.6f, -24.27f)
                arcTo(1.63f, 1.63f, 0.0f, false, true, 38.23f, 79.14f)
                close()
                moveTo(210.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 118.0f)
                lineTo(210.0f, 118.0f)
                close()
            }
        }
        .build()
        return `_film-slate-light`!!
    }

private var `_film-slate-light`: ImageVector? = null
