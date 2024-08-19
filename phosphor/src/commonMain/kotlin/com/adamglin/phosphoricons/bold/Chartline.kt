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

public val BoldGroup.Chartline: ImageVector
    get() {
        if (_chartline != null) {
            return _chartline!!
        }
        _chartline = Builder(name = "Chartline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(85.55f)
                lineTo(88.1f, 95.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.1f, -0.57f)
                lineToRelative(56.22f, 42.16f)
                lineTo(216.1f, 87.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 231.9f, 105.0f)
                lineToRelative(-64.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.1f, 0.57f)
                lineTo(96.58f, 119.44f)
                lineTo(44.0f, 165.45f)
                verticalLineTo(196.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartline!!
    }

private var _chartline: ImageVector? = null
