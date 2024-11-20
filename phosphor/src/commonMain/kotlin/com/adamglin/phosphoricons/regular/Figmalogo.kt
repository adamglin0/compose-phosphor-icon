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

public val RegularGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -24.0f, -72.0f)
                lineTo(96.0f, 24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 1.37f, 65.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 144.0f, 196.0f)
                lineTo(144.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 48.0f, -64.0f)
                close()
                moveTo(192.0f, 64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(144.0f, 88.0f)
                lineTo(144.0f, 40.0f)
                horizontalLineToRelative(24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 192.0f, 64.0f)
                close()
                moveTo(72.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 40.0f)
                horizontalLineToRelative(32.0f)
                lineTo(128.0f, 88.0f)
                lineTo(96.0f, 88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 64.0f)
                close()
                moveTo(96.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(48.0f)
                lineTo(96.0f, 152.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                horizontalLineToRelative(28.0f)
                close()
                moveTo(168.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
