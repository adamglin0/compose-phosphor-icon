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

public val DuotoneGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineTo(96.0f)
                lineTo(46.34f, 45.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 54.0f, 40.0f)
                horizontalLineTo(202.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.69f, 5.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.69f, 93.81f)
                lineTo(217.35f, 43.6f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 202.0f, 32.0f)
                lineTo(54.0f, 32.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 38.65f, 43.6f)
                lineTo(24.31f, 93.81f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 24.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, 32.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 16.0f, -32.0f)
                lineTo(232.0f, 96.0f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 231.69f, 93.81f)
                close()
                moveTo(54.0f, 48.0f)
                lineTo(202.0f, 48.0f)
                lineToRelative(11.42f, 40.0f)
                lineTo(42.61f, 88.0f)
                close()
                moveTo(152.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(51.06f, 132.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 40.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                lineTo(88.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -35.12f, 21.26f)
                arcTo(7.88f, 7.88f, 0.0f, false, false, 51.06f, 132.2f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                lineTo(56.0f, 151.2f)
                arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, 0.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, -16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 32.0f, 16.0f)
                arcToRelative(40.57f, 40.57f, 0.0f, false, false, 8.0f, -0.8f)
                close()
                moveTo(216.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -11.07f, 20.2f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, -1.8f, 1.05f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
