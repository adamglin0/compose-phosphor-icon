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

public val BoldGroup.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) {
            return _tidalLogo!!
        }
        _tidalLogo = Builder(name = "TidalLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.49f, 87.51f)
                lineToRelative(-38.0f, -38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(168.0f, 79.0f)
                lineTo(136.49f, 47.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(88.0f, 79.0f)
                lineTo(58.49f, 49.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-38.0f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(38.0f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(88.0f, 113.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(79.51f, 167.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(145.0f, 136.0f)
                lineToRelative(23.0f, -23.0f)
                lineToRelative(29.51f, 29.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(38.0f, -38.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 252.49f, 87.51f)
                close()
                moveTo(50.0f, 117.0f)
                lineTo(29.0f, 96.0f)
                lineTo(50.0f, 75.0f)
                lineTo(71.0f, 96.0f)
                close()
                moveTo(128.0f, 199.0f)
                lineTo(105.0f, 176.0f)
                lineTo(128.0f, 153.0f)
                lineTo(151.0f, 176.0f)
                close()
                moveTo(128.0f, 119.0f)
                lineTo(105.0f, 96.0f)
                lineToRelative(23.0f, -23.0f)
                lineToRelative(23.0f, 23.0f)
                close()
                moveTo(206.0f, 117.0f)
                lineTo(185.0f, 96.0f)
                lineToRelative(21.0f, -21.0f)
                lineToRelative(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
