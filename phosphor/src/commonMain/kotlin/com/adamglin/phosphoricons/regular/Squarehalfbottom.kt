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

public val RegularGroup.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) {
            return _squareHalfBottom!!
        }
        _squareHalfBottom = Builder(name = "SquareHalfBottom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 56.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(200.0f, 56.0f)
                verticalLineToRelative(64.0f)
                lineTo(56.0f, 120.0f)
                lineTo(56.0f, 56.0f)
                close()
                moveTo(104.0f, 136.0f)
                verticalLineToRelative(64.0f)
                lineTo(88.0f, 200.0f)
                lineTo(88.0f, 136.0f)
                close()
                moveTo(120.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                lineTo(120.0f, 200.0f)
                close()
                moveTo(152.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                lineTo(152.0f, 200.0f)
                close()
                moveTo(56.0f, 136.0f)
                lineTo(72.0f, 136.0f)
                verticalLineToRelative(64.0f)
                lineTo(56.0f, 200.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(184.0f, 200.0f)
                lineTo(184.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
