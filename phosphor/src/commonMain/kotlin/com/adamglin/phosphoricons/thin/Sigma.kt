package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 72.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(72.32f)
                lineToRelative(58.8f, 73.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.0f)
                lineTo(72.32f, 204.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.12f, -6.5f)
                lineToRelative(62.0f, -77.5f)
                lineToRelative(-62.0f, -77.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 44.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
