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

public val ThinGroup.Currencyjpy: ImageVector
    get() {
        if (_currencyjpy != null) {
            return _currencyjpy!!
        }
        _currencyjpy = Builder(name = "Currencyjpy", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.1f, 50.53f)
                lineTo(136.44f, 132.0f)
                horizontalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(132.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(132.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(140.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(39.56f)
                lineTo(52.9f, 50.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.2f, -5.06f)
                lineTo(128.0f, 129.68f)
                lineToRelative(68.9f, -84.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.2f, 5.06f)
                close()
            }
        }
        .build()
        return _currencyjpy!!
    }

private var _currencyjpy: ImageVector? = null
