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

public val DuotoneGroup.Imagessquare: ImageVector
    get() {
        if (_imagessquare != null) {
            return _imagessquare!!
        }
        _imagessquare = Builder(name = "Imagessquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(80.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(72.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(96.69f, 184.0f)
                lineToRelative(77.65f, -77.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(216.0f, 136.69f)
                lineTo(216.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(120.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(80.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 48.0f)
                lineTo(64.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 80.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(176.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 192.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(80.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                verticalLineToRelative(69.38f)
                lineToRelative(-16.7f, -16.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(93.37f, 176.0f)
                lineTo(80.0f, 176.0f)
                close()
                moveTo(176.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 80.0f)
                lineTo(64.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(208.0f, 176.0f)
                lineTo(116.0f, 176.0f)
                lineToRelative(64.0f, -64.0f)
                lineToRelative(28.0f, 28.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(120.0f, 112.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 96.0f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 120.0f, 112.0f)
                close()
                moveTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 80.0f)
                close()
            }
        }
        .build()
        return _imagessquare!!
    }

private var _imagessquare: ImageVector? = null
