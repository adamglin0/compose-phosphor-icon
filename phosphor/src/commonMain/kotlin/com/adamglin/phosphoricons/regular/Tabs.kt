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

public val RegularGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.66f, 165.7f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, 0.0f, -0.08f)
                lineTo(233.37f, 91.4f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 218.05f, 80.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(10.05f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(206.0f)
                lineTo(185.37f, 91.4f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 170.05f, 80.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(10.05f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(158.0f)
                lineTo(137.37f, 91.4f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 122.05f, 80.0f)
                horizontalLineTo(38.0f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 22.63f, 91.4f)
                lineTo(0.37f, 165.6f)
                lineToRelative(0.0f, 0.05f)
                verticalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.05f, 0.0f, 0.08f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 0.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.66f, -10.3f)
                close()
                moveTo(38.0f, 96.0f)
                horizontalLineToRelative(84.1f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(18.75f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
