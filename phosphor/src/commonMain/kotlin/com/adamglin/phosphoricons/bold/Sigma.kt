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

public val BoldGroup.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 72.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(89.0f)
                lineToRelative(48.4f, 60.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 15.0f)
                lineTo(89.0f, 196.0f)
                horizontalLineToRelative(91.0f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.37f, -19.5f)
                lineToRelative(58.0f, -72.5f)
                lineToRelative(-58.0f, -72.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 36.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
