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

public val ThinGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                horizontalLineTo(72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.52f)
                lineToRelative(-7.9f, 46.81f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -0.06f, 0.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -0.06f, -0.67f)
                lineTo(148.0f, 160.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.52f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(72.0f, 36.0f)
                horizontalLineTo(180.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 36.0f)
                close()
                moveTo(200.0f, 148.0f)
                horizontalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.88f, 13.7f)
                reflectiveCurveToRelative(0.0f, 0.06f, 0.0f, 0.1f)
                lineTo(148.0f, 208.32f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineToRelative(7.86f, -46.52f)
                reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 148.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 148.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
