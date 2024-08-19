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

public val RegularGroup.Cranetower: ImageVector
    get() {
        if (_cranetower != null) {
            return _cranetower!!
        }
        _cranetower = Builder(name = "Cranetower", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 80.0f)
                lineTo(108.94f, 80.0f)
                lineTo(87.16f, 36.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 80.0f)
                lineTo(24.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(40.0f, 96.0f)
                lineTo(40.0f, 208.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(128.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(112.0f, 208.0f)
                lineTo(112.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(88.0f)
                lineTo(192.0f, 184.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(56.0f, 48.0f)
                lineTo(75.06f, 48.0f)
                lineToRelative(16.0f, 32.0f)
                lineTo(56.0f, 80.0f)
                close()
                moveTo(56.0f, 208.0f)
                lineTo(56.0f, 160.0f)
                lineTo(96.0f, 160.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(96.0f, 144.0f)
                lineTo(56.0f, 144.0f)
                lineTo(56.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cranetower!!
    }

private var _cranetower: ImageVector? = null
