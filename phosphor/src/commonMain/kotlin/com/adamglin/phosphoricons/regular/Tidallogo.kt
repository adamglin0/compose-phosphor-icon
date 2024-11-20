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

public val RegularGroup.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) {
            return _tidalLogo!!
        }
        _tidalLogo = Builder(name = "TidalLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.66f, 90.34f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(168.0f, 84.69f)
                lineTo(133.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(88.0f, 84.69f)
                lineTo(53.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineTo(88.0f, 107.31f)
                lineTo(116.69f, 136.0f)
                lineTo(82.34f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineTo(139.31f, 136.0f)
                lineTo(168.0f, 107.31f)
                lineToRelative(34.34f, 34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 253.66f, 90.34f)
                close()
                moveTo(48.0f, 124.69f)
                lineTo(19.31f, 96.0f)
                lineTo(48.0f, 67.31f)
                lineTo(76.69f, 96.0f)
                close()
                moveTo(128.0f, 204.69f)
                lineTo(99.31f, 176.0f)
                lineTo(128.0f, 147.31f)
                lineTo(156.69f, 176.0f)
                close()
                moveTo(128.0f, 124.69f)
                lineTo(99.31f, 96.0f)
                lineTo(128.0f, 67.31f)
                lineTo(156.69f, 96.0f)
                close()
                moveTo(208.0f, 124.69f)
                lineTo(179.31f, 96.0f)
                lineTo(208.0f, 67.31f)
                lineTo(236.69f, 96.0f)
                close()
            }
        }
        .build()
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
