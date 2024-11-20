package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 28.0f)
                lineTo(88.0f, 28.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 28.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.79f, -0.62f)
                curveToRelative(27.63f, -9.21f, 78.38f, -60.0f, 87.59f, -87.59f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 228.0f, 136.0f)
                lineTo(228.0f, 88.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 168.0f, 28.0f)
                close()
                moveTo(52.0f, 168.0f)
                lineTo(52.0f, 88.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 88.0f, 52.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                verticalLineToRelative(36.0f)
                lineTo(184.0f, 124.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                verticalLineToRelative(20.0f)
                lineTo(88.0f, 204.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 52.0f, 168.0f)
                close()
                moveTo(148.0f, 195.63f)
                lineTo(148.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(11.63f)
                curveTo(184.0f, 164.11f, 164.11f, 184.0f, 148.0f, 195.63f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
