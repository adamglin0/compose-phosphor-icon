package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Exclude: ImageVector
    get() {
        if (_exclude != null) {
            return _exclude!!
        }
        _exclude = Builder(name = "Exclude", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.91f, 83.09f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.82f, 89.82f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.82f, -89.82f)
                close()
                moveTo(226.0f, 160.0f)
                arcToRelative(65.31f, 65.31f, 0.0f, false, true, -0.62f, 8.9f)
                lineToRelative(-53.76f, -53.77f)
                arcTo(77.84f, 77.84f, 0.0f, false, false, 174.0f, 96.0f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.0f, -0.49f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 226.0f, 160.0f)
                close()
                moveTo(45.31f, 53.79f)
                lineToRelative(55.5f, 55.5f)
                arcToRelative(77.86f, 77.86f, 0.0f, false, false, -12.0f, 19.0f)
                lineTo(34.0f, 73.48f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 45.31f, 53.79f)
                close()
                moveTo(73.48f, 34.0f)
                lineToRelative(54.8f, 54.81f)
                arcToRelative(77.86f, 77.86f, 0.0f, false, false, -19.0f, 12.0f)
                lineToRelative(-55.5f, -55.5f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 73.48f, 34.0f)
                close()
                moveTo(94.0f, 160.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, true, 66.0f, -66.0f)
                curveToRelative(0.65f, 0.0f, 1.3f, 0.0f, 1.95f, 0.0f)
                curveToRelative(0.0f, 0.65f, 0.05f, 1.3f, 0.05f, 2.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, true, -66.0f, 66.0f)
                curveToRelative(-0.65f, 0.0f, -1.3f, 0.0f, -2.0f, -0.05f)
                curveTo(94.0f, 161.3f, 94.0f, 160.65f, 94.0f, 160.0f)
                close()
                moveTo(146.71f, 155.19f)
                lineTo(202.21f, 210.69f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 182.52f, 222.0f)
                lineToRelative(-54.8f, -54.81f)
                arcTo(77.86f, 77.86f, 0.0f, false, false, 146.71f, 155.19f)
                close()
                moveTo(155.19f, 146.71f)
                arcToRelative(77.86f, 77.86f, 0.0f, false, false, 12.0f, -19.0f)
                lineTo(222.0f, 182.52f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -11.35f, 19.69f)
                close()
                moveTo(160.49f, 82.01f)
                lineTo(160.0f, 82.01f)
                arcToRelative(77.84f, 77.84f, 0.0f, false, false, -19.13f, 2.38f)
                lineTo(87.1f, 30.62f)
                arcTo(65.31f, 65.31f, 0.0f, false, true, 96.0f, 30.0f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 160.49f, 82.0f)
                close()
                moveTo(30.0f, 96.0f)
                arcToRelative(65.31f, 65.31f, 0.0f, false, true, 0.62f, -8.9f)
                lineToRelative(53.76f, 53.77f)
                arcTo(77.84f, 77.84f, 0.0f, false, false, 82.0f, 160.0f)
                curveToRelative(0.0f, 0.17f, 0.0f, 0.33f, 0.0f, 0.49f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 30.0f, 96.0f)
                close()
                moveTo(95.51f, 174.0f)
                lineTo(96.0f, 174.0f)
                arcToRelative(77.84f, 77.84f, 0.0f, false, false, 19.13f, -2.38f)
                lineToRelative(53.77f, 53.76f)
                arcToRelative(65.31f, 65.31f, 0.0f, false, true, -8.9f, 0.62f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 95.51f, 174.0f)
                close()
            }
        }
        .build()
        return _exclude!!
    }

private var _exclude: ImageVector? = null
