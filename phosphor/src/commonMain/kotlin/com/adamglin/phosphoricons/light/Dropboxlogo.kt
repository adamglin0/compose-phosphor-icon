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

public val LightGroup.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) {
            return _dropboxLogo!!
        }
        _dropboxLogo = Builder(name = "DropboxLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.42f, 151.07f)
                lineTo(190.54f, 120.0f)
                lineToRelative(44.88f, -31.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.86f)
                lineToRelative(-52.0f, -36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.84f, 0.0f)
                lineTo(128.0f, 76.7f)
                lineTo(79.42f, 43.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.84f, 0.0f)
                lineToRelative(-52.0f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 9.86f)
                lineTo(65.46f, 120.0f)
                lineTo(20.58f, 151.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 9.86f)
                lineToRelative(52.0f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.84f, 0.0f)
                lineTo(128.0f, 163.3f)
                lineToRelative(48.58f, 33.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.84f, 0.0f)
                lineToRelative(52.0f, -36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.86f)
                close()
                moveTo(128.0f, 148.7f)
                lineTo(86.54f, 120.0f)
                lineTo(128.0f, 91.3f)
                lineTo(169.46f, 120.0f)
                close()
                moveTo(180.0f, 55.3f)
                lineTo(221.46f, 84.0f)
                lineTo(180.0f, 112.7f)
                lineTo(138.54f, 84.0f)
                close()
                moveTo(76.0f, 55.3f)
                lineTo(117.46f, 84.0f)
                lineTo(76.0f, 112.7f)
                lineTo(34.54f, 84.0f)
                close()
                moveTo(76.0f, 184.7f)
                lineTo(34.54f, 156.0f)
                lineTo(76.0f, 127.3f)
                lineTo(117.46f, 156.0f)
                close()
                moveTo(180.0f, 184.7f)
                lineTo(138.54f, 156.0f)
                lineTo(180.0f, 127.3f)
                lineTo(221.46f, 156.0f)
                close()
                moveTo(156.82f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.51f, 8.35f)
                lineToRelative(-23.89f, 16.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.84f, 0.0f)
                lineToRelative(-23.89f, -16.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.83f, -9.86f)
                lineTo(128.0f, 220.7f)
                lineToRelative(20.48f, -14.17f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 156.82f, 208.0f)
                close()
            }
        }
        .build()
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
