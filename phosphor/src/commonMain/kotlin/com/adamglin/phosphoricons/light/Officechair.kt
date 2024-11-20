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

public val LightGroup.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) {
            return _officeChair!!
        }
        _officeChair = Builder(name = "OfficeChair", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(221.61f, 134.0f)
                arcTo(46.07f, 46.07f, 0.0f, false, true, 176.0f, 174.0f)
                lineTo(134.0f, 174.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, 30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                lineTo(134.0f, 214.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 214.0f)
                lineTo(96.0f, 214.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, -30.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 174.0f)
                lineTo(80.0f, 174.0f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, -45.61f, -40.0f)
                lineTo(16.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, 34.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(69.43f, 137.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 66.14f, 126.0f)
                lineTo(79.86f, 30.0f)
                arcTo(14.07f, 14.07f, 0.0f, false, true, 93.72f, 18.0f)
                horizontalLineToRelative(68.56f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, true, 13.86f, 12.0f)
                lineToRelative(13.72f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 176.0f, 142.0f)
                lineTo(80.0f, 142.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 69.43f, 137.17f)
                close()
                moveTo(78.49f, 129.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 80.0f, 130.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.51f, -0.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.47f, -1.59f)
                lineToRelative(-13.72f, -96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -1.72f)
                lineTo(93.72f, 30.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.72f)
                lineTo(78.0f, 127.72f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 78.49f, 129.31f)
                close()
            }
        }
        .build()
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
