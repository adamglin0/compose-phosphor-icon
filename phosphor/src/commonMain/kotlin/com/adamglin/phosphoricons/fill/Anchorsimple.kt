package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) {
            return _anchorSimple!!
        }
        _anchorSimple = Builder(name = "AnchorSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -208.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(40.36f)
                arcTo(88.15f, 88.15f, 0.0f, false, false, 120.0f, 207.63f)
                verticalLineTo(90.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineToRelative(116.8f)
                arcTo(88.15f, 88.15f, 0.0f, false, false, 215.64f, 128.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 120.0f)
                close()
            }
        }
        .build()
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
