package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Imagesquare: ImageVector
    get() {
        if (_imagesquare != null) {
            return _imagesquare!!
        }
        _imagesquare = Builder(name = "Imagesquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                verticalLineToRelative(77.38f)
                lineToRelative(-24.69f, -24.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineTo(53.37f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(76.0f, 208.0f)
                lineToRelative(96.0f, -96.0f)
                lineToRelative(36.0f, 36.0f)
                verticalLineToRelative(60.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 72.0f, 96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 96.0f, 120.0f)
                close()
                moveTo(96.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 88.0f)
                close()
            }
        }
        .build()
        return _imagesquare!!
    }

private var _imagesquare: ImageVector? = null
