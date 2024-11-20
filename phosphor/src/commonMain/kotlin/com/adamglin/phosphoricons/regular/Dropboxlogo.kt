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

public val RegularGroup.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) {
            return _dropboxLogo!!
        }
        _dropboxLogo = Builder(name = "DropboxLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.55f, 149.42f)
                lineTo(194.05f, 120.0f)
                lineToRelative(42.5f, -29.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.16f)
                lineToRelative(-52.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.1f, 0.0f)
                lineTo(128.0f, 74.27f)
                lineTo(80.55f, 41.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.1f, 0.0f)
                lineToRelative(-52.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.16f)
                lineTo(62.0f, 120.0f)
                lineToRelative(-42.5f, 29.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.16f)
                lineToRelative(52.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.1f, 0.0f)
                lineTo(128.0f, 165.73f)
                lineToRelative(47.45f, 32.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.1f, 0.0f)
                lineToRelative(52.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.16f)
                close()
                moveTo(128.0f, 146.27f)
                lineTo(90.05f, 120.0f)
                lineToRelative(38.0f, -26.27f)
                lineTo(166.0f, 120.0f)
                close()
                moveTo(180.0f, 57.73f)
                lineTo(218.0f, 84.0f)
                lineTo(180.0f, 110.27f)
                lineTo(142.05f, 84.0f)
                close()
                moveTo(76.0f, 57.73f)
                lineTo(114.0f, 84.0f)
                lineTo(76.0f, 110.27f)
                lineTo(38.05f, 84.0f)
                close()
                moveTo(76.0f, 182.27f)
                lineTo(38.05f, 156.0f)
                lineToRelative(38.0f, -26.27f)
                lineTo(114.0f, 156.0f)
                close()
                moveTo(180.0f, 182.27f)
                lineTo(142.05f, 156.0f)
                lineTo(180.0f, 129.73f)
                lineTo(218.0f, 156.0f)
                close()
                moveTo(158.47f, 206.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 11.13f)
                lineToRelative(-23.89f, 16.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.1f, 0.0f)
                lineTo(99.56f, 218.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.1f, -13.16f)
                lineTo(128.0f, 218.27f)
                lineToRelative(19.34f, -13.39f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 158.47f, 206.91f)
                close()
            }
        }
        .build()
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
