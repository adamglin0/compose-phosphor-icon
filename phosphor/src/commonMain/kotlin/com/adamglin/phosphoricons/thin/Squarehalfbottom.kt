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

public val ThinGroup.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) {
            return _squareHalfBottom!!
        }
        _squareHalfBottom = Builder(name = "SquareHalfBottom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(56.0f, 52.0f)
                lineTo(200.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(68.0f)
                lineTo(52.0f, 124.0f)
                lineTo(52.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 52.0f)
                close()
                moveTo(108.0f, 132.0f)
                verticalLineToRelative(72.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 132.0f)
                close()
                moveTo(116.0f, 132.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(72.0f)
                lineTo(116.0f, 204.0f)
                close()
                moveTo(148.0f, 132.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(72.0f)
                lineTo(148.0f, 204.0f)
                close()
                moveTo(52.0f, 200.0f)
                lineTo(52.0f, 132.0f)
                lineTo(76.0f, 132.0f)
                verticalLineToRelative(72.0f)
                lineTo(56.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 200.0f)
                close()
                moveTo(200.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 132.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
