package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Handtap: ImageVector
    get() {
        if (_handtap != null) {
            return _handtap!!
        }
        _handtap = Builder(name = "Handtap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 148.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 24.0f, -8.0f, 40.0f, -8.0f, 40.0f)
                horizontalLineTo(72.0f)
                lineTo(42.68f, 174.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f)
                lineTo(96.0f, 184.0f)
                verticalLineTo(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 76.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                close()
                moveTo(196.0f, 120.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -13.36f, 3.39f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 144.0f, 106.7f)
                lineTo(144.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(80.0f)
                lineToRelative(-3.82f, -6.13f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.41f, 28.17f)
                lineToRelative(29.32f, 50.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 78.89f, 220.0f)
                lineTo(49.6f, 170.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, -12.0f)
                lineToRelative(0.14f, 0.23f)
                lineToRelative(18.68f, 30.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 184.0f)
                lineTo(104.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(144.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 21.61f, -7.1f, 36.3f, -7.16f, 36.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, 10.73f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 208.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, -4.42f)
                curveToRelative(0.37f, -0.73f, 8.85f, -18.0f, 8.85f, -43.58f)
                lineTo(224.01f, 148.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 120.0f)
                close()
            }
        }
        .build()
        return _handtap!!
    }

private var _handtap: ImageVector? = null
