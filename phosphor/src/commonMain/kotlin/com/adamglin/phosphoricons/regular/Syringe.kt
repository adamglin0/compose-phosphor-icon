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

public val RegularGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 66.34f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(196.69f, 48.0f)
                lineTo(168.0f, 76.69f)
                lineTo(133.66f, 42.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(128.69f, 60.0f)
                lineToRelative(-84.0f, 84.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 40.0f, 155.31f)
                verticalLineToRelative(49.38f)
                lineTo(18.34f, 226.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(51.31f, 216.0f)
                horizontalLineToRelative(49.38f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 112.0f, 211.31f)
                lineToRelative(84.0f, -84.0f)
                lineToRelative(6.34f, 6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(179.31f, 88.0f)
                lineTo(208.0f, 59.31f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(100.69f, 200.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(155.31f)
                lineToRelative(18.0f, -18.0f)
                lineToRelative(20.34f, 20.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(85.31f, 126.0f)
                lineTo(98.0f, 113.31f)
                lineToRelative(20.34f, 20.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(109.31f, 102.0f)
                lineTo(140.0f, 71.31f)
                lineTo(184.69f, 116.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
