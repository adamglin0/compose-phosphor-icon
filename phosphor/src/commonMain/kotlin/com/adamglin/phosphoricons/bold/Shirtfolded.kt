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

public val BoldGroup.Shirtfolded: ImageVector
    get() {
        if (_shirtfolded != null) {
            return _shirtfolded!!
        }
        _shirtfolded = Builder(name = "Shirtfolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                horizontalLineTo(177.0f)
                lineTo(164.49f, 23.51f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 20.0f)
                horizontalLineTo(100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f)
                horizontalLineToRelative(0.0f)
                lineTo(79.0f, 36.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(96.0f, 53.0f)
                lineToRelative(7.33f, -7.33f)
                lineTo(118.82f, 72.2f)
                lineTo(96.0f, 94.48f)
                close()
                moveTo(137.18f, 72.2f)
                lineToRelative(15.49f, -26.56f)
                lineTo(160.0f, 53.0f)
                verticalLineTo(94.48f)
                close()
                moveTo(60.0f, 60.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.08f, 14.21f)
                lineTo(116.0f, 108.5f)
                verticalLineTo(204.0f)
                horizontalLineTo(60.0f)
                close()
                moveTo(196.0f, 204.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(108.5f)
                lineToRelative(9.92f, 9.69f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 104.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _shirtfolded!!
    }

private var _shirtfolded: ImageVector? = null
