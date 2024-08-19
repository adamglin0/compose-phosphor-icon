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

public val DuotoneGroup.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, 44.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(52.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 168.0f, 84.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.31f, 188.0f)
                lineToRelative(22.35f, -22.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(172.0f, 176.69f)
                lineToRelative(-41.15f, -41.16f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 124.0f, 32.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(28.69f)
                lineToRelative(52.0f, 52.0f)
                lineToRelative(-22.35f, 22.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(172.0f, 199.31f)
                lineToRelative(22.34f, 22.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(80.0f, 48.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                horizontalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
