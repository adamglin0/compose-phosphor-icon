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

public val LightGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.23f, 26.77f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -42.43f, 0.0f)
                lineToRelative(-0.32f, 0.34f)
                lineTo(131.67f, 91.16f)
                lineToRelative(-12.11f, -12.1f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.11f, 0.0f)
                lineTo(11.76f, 155.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.49f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, 0.0f)
                lineToRelative(76.69f, -76.69f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -31.11f)
                lineToRelative(-12.1f, -12.11f)
                lineToRelative(64.0f, -54.81f)
                lineToRelative(0.34f, -0.32f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 229.23f, 26.77f)
                close()
                moveTo(96.0f, 231.51f)
                lineTo(76.49f, 212.0f)
                lineToRelative(23.76f, -23.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                lineTo(68.0f, 203.51f)
                lineTo(52.49f, 188.0f)
                lineToRelative(23.76f, -23.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                lineTo(44.0f, 179.51f)
                lineTo(24.49f, 160.0f)
                lineTo(72.0f, 112.48f)
                lineTo(143.52f, 184.0f)
                close()
                moveTo(220.89f, 60.56f)
                lineToRelative(-68.78f, 58.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.1f, 4.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.47f)
                lineToRelative(16.68f, 16.69f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.15f)
                lineTo(152.0f, 175.51f)
                lineTo(80.49f, 104.0f)
                lineTo(96.93f, 87.55f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.15f, 0.0f)
                lineToRelative(16.69f, 16.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.8f, -0.34f)
                lineToRelative(58.87f, -68.78f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.45f, 25.45f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
