package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Film-slate-fill`: ImageVector
    get() {
        if (`_film-slate-fill` != null) {
            return `_film-slate-fill`!!
        }
        `_film-slate-fill` = Builder(name = "Film-slate-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                horizontalLineTo(102.09f)
                lineTo(210.0f, 75.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.68f, -9.84f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -19.42f, -11.13f)
                lineTo(35.81f, 64.74f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, -9.7f, 7.4f)
                arcToRelative(15.51f, 15.51f, 0.0f, false, false, -1.55f, 12.0f)
                lineTo(32.0f, 111.56f)
                curveToRelative(0.0f, 0.14f, 0.0f, 0.29f, 0.0f, 0.44f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f)
                close()
                moveTo(192.16f, 40.0f)
                lineToRelative(6.0f, 22.07f)
                lineTo(164.57f, 71.0f)
                lineTo(136.44f, 54.72f)
                close()
                moveTo(77.55f, 70.27f)
                lineToRelative(28.12f, 16.24f)
                lineToRelative(-59.6f, 15.73f)
                lineToRelative(-6.0f, -22.08f)
                close()
            }
        }
        .build()
        return `_film-slate-fill`!!
    }

private var `_film-slate-fill`: ImageVector? = null
