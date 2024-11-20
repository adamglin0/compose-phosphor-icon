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

public val ThinGroup.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) {
            return _dropboxLogo!!
        }
        _dropboxLogo = Builder(name = "DropboxLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.28f, 152.71f)
                lineTo(187.0f, 120.0f)
                lineToRelative(47.25f, -32.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.58f)
                lineToRelative(-52.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.56f, 0.0f)
                lineTo(128.0f, 79.14f)
                lineTo(78.28f, 44.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.56f, 0.0f)
                lineToRelative(-52.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.58f)
                lineTo(69.0f, 120.0f)
                lineTo(21.72f, 152.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.58f)
                lineToRelative(52.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.56f, 0.0f)
                lineTo(128.0f, 160.86f)
                lineToRelative(49.72f, 34.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.56f, 0.0f)
                lineToRelative(52.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.58f)
                close()
                moveTo(128.0f, 151.14f)
                lineTo(83.0f, 120.0f)
                lineToRelative(45.0f, -31.14f)
                lineTo(173.0f, 120.0f)
                close()
                moveTo(180.0f, 52.87f)
                lineTo(225.0f, 84.0f)
                lineToRelative(-45.0f, 31.13f)
                lineTo(135.0f, 84.0f)
                close()
                moveTo(76.0f, 52.87f)
                lineTo(121.0f, 84.0f)
                lineTo(76.0f, 115.13f)
                lineTo(31.0f, 84.0f)
                close()
                moveTo(76.0f, 187.13f)
                lineTo(31.0f, 156.0f)
                lineToRelative(45.0f, -31.13f)
                lineTo(121.0f, 156.0f)
                close()
                moveTo(180.0f, 187.13f)
                lineTo(135.0f, 156.0f)
                lineToRelative(45.0f, -31.13f)
                lineTo(225.0f, 156.0f)
                close()
                moveTo(155.18f, 209.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 5.57f)
                lineToRelative(-23.89f, 16.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.56f, 0.0f)
                lineToRelative(-23.89f, -16.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.56f, -6.58f)
                lineToRelative(21.61f, 15.0f)
                lineToRelative(21.61f, -15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.18f, 209.18f)
                close()
            }
        }
        .build()
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
