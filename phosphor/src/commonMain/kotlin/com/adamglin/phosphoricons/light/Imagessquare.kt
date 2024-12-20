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

public val LightGroup.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) {
            return _imagesSquare!!
        }
        _imagesSquare = Builder(name = "ImagesSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(80.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 66.0f, 48.0f)
                lineTo(66.0f, 66.0f)
                lineTo(48.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 80.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(176.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.0f, 190.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(78.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(74.2f)
                lineToRelative(-20.1f, -20.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(94.2f, 178.0f)
                lineTo(80.0f, 178.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(178.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(66.0f, 78.0f)
                verticalLineToRelative(98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(98.0f)
                close()
                moveTo(208.0f, 178.0f)
                lineTo(111.17f, 178.0f)
                lineToRelative(67.41f, -67.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineTo(210.0f, 139.17f)
                lineTo(210.0f, 176.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 178.0f)
                close()
                moveTo(120.0f, 110.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 98.0f, 88.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 120.0f, 110.0f)
                close()
                moveTo(120.0f, 78.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 120.0f, 78.0f)
                close()
            }
        }
        .build()
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
