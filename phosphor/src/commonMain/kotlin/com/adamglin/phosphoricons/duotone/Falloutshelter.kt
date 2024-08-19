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

public val DuotoneGroup.Falloutshelter: ImageVector
    get() {
        if (_falloutshelter != null) {
            return _falloutshelter!!
        }
        _falloutshelter = Builder(name = "Falloutshelter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(160.0f, 176.0f)
                lineTo(128.0f, 128.0f)
                lineTo(96.0f, 176.0f)
                lineTo(64.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                lineTo(96.0f, 80.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(-32.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(199.05f, 124.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 120.0f)
                lineTo(143.0f, 120.0f)
                lineToRelative(23.71f, -35.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 72.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f)
                lineTo(113.05f, 120.0f)
                lineTo(64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f)
                lineToRelative(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 0.0f)
                lineToRelative(25.34f, -38.0f)
                lineToRelative(25.34f, 38.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 0.0f)
                lineToRelative(32.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 199.05f, 124.23f)
                close()
                moveTo(145.05f, 88.0f)
                lineTo(128.0f, 113.58f)
                lineTo(111.0f, 88.0f)
                close()
                moveTo(96.0f, 161.58f)
                lineTo(79.0f, 136.0f)
                horizontalLineToRelative(34.1f)
                close()
                moveTo(160.0f, 161.58f)
                lineTo(143.0f, 136.0f)
                horizontalLineToRelative(34.1f)
                close()
            }
        }
        .build()
        return _falloutshelter!!
    }

private var _falloutshelter: ImageVector? = null
