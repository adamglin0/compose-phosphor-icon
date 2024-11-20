package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) {
            return _paintBrushHousehold!!
        }
        _paintBrushHousehold = Builder(name = "PaintBrushHousehold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.64f, 25.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                quadToRelative(-0.21f, 0.21f, -0.42f, 0.45f)
                lineTo(131.55f, 88.22f)
                lineTo(121.0f, 77.64f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.95f, 0.0f)
                lineToRelative(-76.69f, 76.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 0.0f)
                lineTo(178.36f, 169.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -33.95f)
                lineToRelative(-10.58f, -10.57f)
                lineTo(230.19f, 71.0f)
                curveToRelative(0.15f, -0.14f, 0.31f, -0.28f, 0.45f, -0.43f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 230.64f, 25.36f)
                close()
                moveTo(96.0f, 228.69f)
                lineTo(79.32f, 212.0f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(68.0f, 200.68f)
                lineTo(55.32f, 188.0f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(44.0f, 176.68f)
                lineTo(27.31f, 160.0f)
                lineToRelative(50.35f, -50.34f)
                lineToRelative(68.69f, 68.69f)
                close()
            }
        }
        .build()
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
