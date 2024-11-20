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

public val BoldGroup.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) {
            return _squareHalfBottom!!
        }
        _squareHalfBottom = Builder(name = "SquareHalfBottom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(196.0f, 60.0f)
                verticalLineToRelative(56.0f)
                lineTo(60.0f, 116.0f)
                lineTo(60.0f, 60.0f)
                close()
                moveTo(116.0f, 140.0f)
                verticalLineToRelative(56.0f)
                lineTo(100.0f, 196.0f)
                lineTo(100.0f, 140.0f)
                close()
                moveTo(140.0f, 140.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(56.0f)
                lineTo(140.0f, 196.0f)
                close()
                moveTo(60.0f, 140.0f)
                lineTo(76.0f, 140.0f)
                verticalLineToRelative(56.0f)
                lineTo(60.0f, 196.0f)
                close()
                moveTo(180.0f, 196.0f)
                lineTo(180.0f, 140.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
