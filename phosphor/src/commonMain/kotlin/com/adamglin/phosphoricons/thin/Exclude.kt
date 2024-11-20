package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Exclude: ImageVector
    get() {
        if (_exclude != null) {
            return _exclude!!
        }
        _exclude = Builder(name = "Exclude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.17f, 84.83f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -86.34f, 86.34f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 86.34f, -86.34f)
                close()
                moveTo(228.0f, 160.0f)
                arcToRelative(68.63f, 68.63f, 0.0f, false, true, -1.27f, 13.07f)
                lineToRelative(-57.34f, -57.34f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 172.0f, 96.0f)
                curveToRelative(0.0f, -1.0f, 0.0f, -2.0f, -0.07f, -2.93f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 228.0f, 160.0f)
                close()
                moveTo(210.8f, 205.14f)
                lineTo(152.46f, 146.81f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, 14.09f, -22.6f)
                lineTo(224.33f, 182.0f)
                arcTo(68.14f, 68.14f, 0.0f, false, true, 210.8f, 205.14f)
                close()
                moveTo(182.0f, 224.33f)
                lineToRelative(-57.78f, -57.78f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, 22.6f, -14.09f)
                lineToRelative(58.33f, 58.34f)
                arcTo(68.14f, 68.14f, 0.0f, false, true, 182.0f, 224.33f)
                close()
                moveTo(45.2f, 50.86f)
                lineToRelative(58.34f, 58.33f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, -14.09f, 22.6f)
                lineTo(31.67f, 74.0f)
                arcTo(68.14f, 68.14f, 0.0f, false, true, 45.2f, 50.86f)
                close()
                moveTo(74.0f, 31.67f)
                lineToRelative(57.78f, 57.78f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, -22.6f, 14.09f)
                lineTo(50.86f, 45.2f)
                arcTo(68.14f, 68.14f, 0.0f, false, true, 74.0f, 31.67f)
                close()
                moveTo(92.0f, 160.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f)
                curveToRelative(1.3f, 0.0f, 2.6f, 0.0f, 3.88f, 0.12f)
                curveTo(164.0f, 93.4f, 164.0f, 94.7f, 164.0f, 96.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, 68.0f)
                curveToRelative(-1.3f, 0.0f, -2.6f, -0.05f, -3.88f, -0.12f)
                curveTo(92.05f, 162.6f, 92.0f, 161.3f, 92.0f, 160.0f)
                close()
                moveTo(162.93f, 84.07f)
                curveToRelative(-1.0f, 0.0f, -2.0f, -0.07f, -2.93f, -0.07f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -19.73f, 2.61f)
                lineTo(82.93f, 29.27f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 80.0f, 54.8f)
                close()
                moveTo(28.0f, 96.0f)
                arcToRelative(68.63f, 68.63f, 0.0f, false, true, 1.27f, -13.07f)
                lineToRelative(57.34f, 57.34f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 84.0f, 160.0f)
                curveToRelative(0.0f, 1.0f, 0.0f, 2.0f, 0.07f, 2.93f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 28.0f, 96.0f)
                close()
                moveTo(93.07f, 171.93f)
                curveToRelative(1.0f, 0.0f, 2.0f, 0.07f, 2.93f, 0.07f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 19.73f, -2.61f)
                lineToRelative(57.34f, 57.34f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -80.0f, -54.8f)
                close()
            }
        }
        .build()
        return _exclude!!
    }

private var _exclude: ImageVector? = null
