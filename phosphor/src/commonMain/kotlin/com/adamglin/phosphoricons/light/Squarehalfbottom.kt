package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Squarehalfbottom: ImageVector
    get() {
        if (_squarehalfbottom != null) {
            return _squarehalfbottom!!
        }
        _squarehalfbottom = Builder(name = "Squarehalfbottom", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                lineTo(56.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 56.0f)
                lineTo(42.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(56.0f, 54.0f)
                lineTo(200.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(66.0f)
                lineTo(54.0f, 122.0f)
                lineTo(54.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 54.0f)
                close()
                moveTo(106.0f, 134.0f)
                verticalLineToRelative(68.0f)
                lineTo(86.0f, 202.0f)
                lineTo(86.0f, 134.0f)
                close()
                moveTo(118.0f, 134.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(68.0f)
                lineTo(118.0f, 202.0f)
                close()
                moveTo(150.0f, 134.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(68.0f)
                lineTo(150.0f, 202.0f)
                close()
                moveTo(54.0f, 200.0f)
                lineTo(54.0f, 134.0f)
                lineTo(74.0f, 134.0f)
                verticalLineToRelative(68.0f)
                lineTo(56.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 200.0f)
                close()
                moveTo(200.0f, 202.0f)
                lineTo(182.0f, 202.0f)
                lineTo(182.0f, 134.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(66.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 202.0f)
                close()
            }
        }
        .build()
        return _squarehalfbottom!!
    }

private var _squarehalfbottom: ImageVector? = null
