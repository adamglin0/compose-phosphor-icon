package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) {
            return _personArmsSpread!!
        }
        _personArmsSpread = Builder(name = "PersonArmsSpread", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.4f, 86.85f)
                arcTo(23.55f, 23.55f, 0.0f, false, false, 212.0f, 68.0f)
                lineTo(150.59f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -45.18f, 0.0f)
                lineTo(44.0f, 68.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 34.0f, 113.79f)
                lineToRelative(0.19f, 0.09f)
                lineToRelative(47.63f, 21.0f)
                lineTo(61.76f, 211.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 12.11f, 30.74f)
                arcTo(23.77f, 23.77f, 0.0f, false, false, 84.0f, 244.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 21.52f, -13.29f)
                lineTo(128.0f, 191.91f)
                lineToRelative(22.51f, 38.8f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 194.24f, 211.0f)
                lineToRelative(-20.0f, -76.15f)
                lineToRelative(47.63f, -21.0f)
                lineToRelative(0.19f, -0.09f)
                arcTo(23.55f, 23.55f, 0.0f, false, false, 235.4f, 86.85f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(155.16f, 117.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.77f, 14.0f)
                lineTo(171.26f, 218.0f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, 0.73f, 2.0f)
                curveToRelative(-0.15f, -0.32f, -0.32f, -0.64f, -0.5f, -0.95f)
                lineTo(138.38f, 162.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.76f, 0.0f)
                lineTo(84.51f, 219.05f)
                curveToRelative(-0.18f, 0.31f, -0.35f, 0.63f, -0.5f, 0.95f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, 0.73f, -2.0f)
                lineToRelative(22.87f, -86.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.77f, -14.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                close()
            }
        }
        .build()
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
