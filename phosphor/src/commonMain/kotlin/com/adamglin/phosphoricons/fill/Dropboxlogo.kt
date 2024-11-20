package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) {
            return _dropboxLogo!!
        }
        _dropboxLogo = Builder(name = "DropboxLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 120.0f)
                lineTo(128.0f, 80.0f)
                lineToRelative(55.56f, -37.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 0.0f)
                lineTo(238.0f, 73.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.32f)
                close()
                moveTo(72.44f, 43.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, 0.0f)
                lineTo(18.0f, 73.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.32f)
                lineTo(68.0f, 120.0f)
                lineToRelative(60.0f, -40.0f)
                close()
                moveTo(238.0f, 153.34f)
                lineTo(188.0f, 120.0f)
                lineToRelative(-60.0f, 40.0f)
                lineToRelative(55.56f, 37.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f)
                lineTo(238.0f, 166.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.0f, 153.34f)
                close()
                moveTo(18.0f, 153.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.32f)
                lineTo(63.56f, 197.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f)
                lineTo(128.0f, 160.0f)
                lineTo(68.0f, 120.0f)
                close()
                moveTo(168.61f, 206.29f)
                lineTo(130.24f, 180.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f)
                lineTo(87.41f, 206.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.65f)
                lineTo(123.56f, 237.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f)
                lineToRelative(36.15f, -24.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.59f, 206.29f)
                close()
            }
        }
        .build()
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
