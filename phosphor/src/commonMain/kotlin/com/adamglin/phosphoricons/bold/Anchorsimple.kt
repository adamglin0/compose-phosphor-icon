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

public val BoldGroup.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) {
            return _anchorSimple!!
        }
        _anchorSimple = Builder(name = "AnchorSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 108.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(11.15f)
                arcTo(84.21f, 84.21f, 0.0f, false, true, 140.0f, 203.14f)
                verticalLineTo(97.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(105.2f)
                arcTo(84.21f, 84.21f, 0.0f, false, true, 44.85f, 132.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 216.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 108.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 52.0f)
                close()
            }
        }
        .build()
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
