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

public val FillGroup.Filetxt: ImageVector
    get() {
        if (_filetxt != null) {
            return _filetxt!!
        }
        _filetxt = Builder(name = "Filetxt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.31f, 156.92f)
                lineTo(137.83f, 180.0f)
                lineToRelative(16.53f, 23.14f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -1.22f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.65f, -1.48f)
                lineTo(128.0f, 193.76f)
                lineToRelative(-13.49f, 18.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.64f, 1.49f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -1.23f, -11.0f)
                lineTo(118.17f, 180.0f)
                lineToRelative(-16.48f, -23.08f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 1.46f, -11.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.36f, 1.71f)
                lineTo(128.0f, 166.24f)
                lineToRelative(13.49f, -18.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.36f, -1.71f)
                arcTo(8.22f, 8.22f, 0.0f, false, true, 154.31f, 156.92f)
                close()
                moveTo(84.0f, 144.0f)
                lineTo(44.27f, 144.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 36.0f, 151.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 44.0f, 160.0f)
                lineTo(56.0f, 160.0f)
                verticalLineToRelative(47.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 63.47f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 208.0f)
                lineTo(72.0f, 160.0f)
                lineTo(83.73f, 160.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 92.0f, 152.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 84.0f, 144.0f)
                close()
                moveTo(212.0f, 144.0f)
                lineTo(172.27f, 144.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.53f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(47.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                lineTo(200.02f, 160.0f)
                horizontalLineToRelative(11.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 8.25f, -7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.0f, 144.0f)
                close()
                moveTo(40.0f, 116.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(44.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 116.0f)
                close()
                moveTo(152.0f, 88.0f)
                horizontalLineToRelative(44.0f)
                lineTo(152.0f, 44.0f)
                close()
            }
        }
        .build()
        return _filetxt!!
    }

private var _filetxt: ImageVector? = null
