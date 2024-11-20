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

public val DuotoneGroup.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) {
            return _bulldozer!!
        }
        _bulldozer = Builder(name = "Bulldozer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 176.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineTo(40.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 8.0f, 176.0f)
                horizontalLineTo(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineTo(160.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 200.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(232.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                lineTo(199.2f, 168.0f)
                arcToRelative(40.09f, 40.09f, 0.0f, false, false, -33.71f, -31.61f)
                lineTo(129.44f, 49.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 114.67f, 40.0f)
                lineTo(24.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 56.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(160.0f, 216.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, 39.2f, -32.0f)
                lineTo(216.0f, 184.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(148.0f, 136.0f)
                lineTo(64.0f, 136.0f)
                lineTo(64.0f, 56.0f)
                horizontalLineToRelative(50.67f)
                close()
                moveTo(48.0f, 56.0f)
                verticalLineToRelative(80.0f)
                lineTo(40.0f, 136.0f)
                arcToRelative(39.72f, 39.72f, 0.0f, false, false, -16.0f, 3.35f)
                lineTo(24.0f, 56.0f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -48.0f)
                lineTo(160.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
                moveTo(168.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(160.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 176.0f)
                close()
            }
        }
        .build()
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
