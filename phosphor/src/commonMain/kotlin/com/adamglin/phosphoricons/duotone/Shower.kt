package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 72.0f)
                lineTo(161.91f, 201.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.54f, 4.34f)
                lineToRelative(-98.0f, -98.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.34f, -13.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 236.0f)
                close()
                moveTo(84.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 192.0f)
                close()
                moveTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 192.0f)
                close()
                moveTo(52.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 160.0f)
                close()
                moveTo(256.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(219.31f, 48.0f)
                lineTo(191.46f, 75.86f)
                lineTo(169.8f, 202.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -27.09f, 8.66f)
                lineToRelative(-98.0f, -98.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.69f, -27.1f)
                lineTo(180.14f, 64.54f)
                lineToRelative(30.2f, -30.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 40.0f)
                close()
                moveTo(174.21f, 81.79f)
                lineTo(56.0f, 102.0f)
                lineToRelative(98.0f, 98.0f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
