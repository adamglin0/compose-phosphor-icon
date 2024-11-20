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

public val ThinGroup.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = Builder(name = "Subtract", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.17f, 84.82f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -86.35f, 86.35f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 86.35f, -86.35f)
                close()
                moveTo(228.0f, 160.0f)
                arcToRelative(68.63f, 68.63f, 0.0f, false, true, -1.27f, 13.07f)
                lineToRelative(-57.34f, -57.34f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 172.0f, 96.0f)
                curveToRelative(0.0f, -1.0f, 0.0f, -2.0f, -0.07f, -2.94f)
                arcTo(67.79f, 67.79f, 0.0f, false, true, 228.0f, 160.0f)
                close()
                moveTo(146.81f, 152.46f)
                lineTo(205.14f, 210.8f)
                arcTo(68.14f, 68.14f, 0.0f, false, true, 182.0f, 224.33f)
                lineToRelative(-57.78f, -57.78f)
                arcTo(76.35f, 76.35f, 0.0f, false, false, 146.81f, 152.46f)
                close()
                moveTo(152.46f, 146.81f)
                arcToRelative(76.35f, 76.35f, 0.0f, false, false, 14.09f, -22.6f)
                lineTo(224.33f, 182.0f)
                arcToRelative(68.14f, 68.14f, 0.0f, false, true, -13.53f, 23.15f)
                close()
                moveTo(28.0f, 96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 28.0f, 96.0f)
                close()
                moveTo(93.06f, 171.93f)
                curveToRelative(1.0f, 0.0f, 2.0f, 0.07f, 2.94f, 0.07f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 19.73f, -2.61f)
                lineToRelative(57.34f, 57.34f)
                arcTo(68.63f, 68.63f, 0.0f, false, true, 160.0f, 228.0f)
                arcTo(67.79f, 67.79f, 0.0f, false, true, 93.06f, 171.93f)
                close()
            }
        }
        .build()
        return _subtract!!
    }

private var _subtract: ImageVector? = null
