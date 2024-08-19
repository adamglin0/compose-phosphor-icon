package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.58f, 129.06f)
                lineTo(146.0f, 110.0f)
                lineToRelative(-19.0f, -51.62f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, -29.88f, 0.0f)
                lineTo(78.0f, 110.0f)
                lineToRelative(-51.62f, 19.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 0.0f, 29.88f)
                lineTo(78.0f, 178.0f)
                lineToRelative(19.0f, 51.62f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 29.88f, 0.0f)
                lineTo(146.0f, 178.0f)
                lineToRelative(51.62f, -19.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 0.0f, -29.88f)
                close()
                moveTo(137.0f, 164.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.74f, 4.74f)
                lineTo(112.0f, 223.85f)
                lineTo(91.78f, 169.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 87.0f, 164.22f)
                lineTo(32.15f, 144.0f)
                lineTo(87.0f, 123.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 91.78f, 119.0f)
                lineTo(112.0f, 64.15f)
                lineTo(132.22f, 119.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.74f, 4.74f)
                lineTo(191.85f, 144.0f)
                close()
                moveTo(144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 40.0f)
                close()
                moveTo(248.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
