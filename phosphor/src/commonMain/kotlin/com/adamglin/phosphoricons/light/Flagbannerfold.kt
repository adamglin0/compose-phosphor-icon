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

public val LightGroup.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) {
            return _flagBannerFold!!
        }
        _flagBannerFold = Builder(name = "FlagBannerFold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.0f, 44.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 42.0f)
                lineTo(152.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.46f, 3.52f)
                lineTo(137.23f, 66.0f)
                lineTo(28.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.44f, 10.0f)
                lineToRelative(36.33f, 40.0f)
                lineTo(23.56f, 156.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 28.0f, 166.0f)
                horizontalLineToRelative(73.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.46f, -3.52f)
                lineTo(115.86f, 142.0f)
                horizontalLineToRelative(66.82f)
                lineToRelative(-36.14f, 79.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 7.94f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 152.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.46f, -3.52f)
                lineToRelative(80.0f, -176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.0f, 44.75f)
                close()
                moveTo(97.23f, 154.0f)
                lineTo(41.56f, 154.0f)
                lineToRelative(30.88f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.08f)
                lineTo(41.56f, 78.0f)
                horizontalLineToRelative(90.21f)
                close()
                moveTo(188.14f, 130.0f)
                lineTo(121.32f, 130.0f)
                lineToRelative(34.54f, -76.0f)
                horizontalLineToRelative(66.82f)
                close()
            }
        }
        .build()
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
