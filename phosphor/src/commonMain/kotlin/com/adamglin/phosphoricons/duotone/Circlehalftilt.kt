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

public val DuotoneGroup.Circlehalftilt: ImageVector
    get() {
        if (_circlehalftilt != null) {
            return _circlehalftilt!!
        }
        _circlehalftilt = Builder(name = "Circlehalftilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(195.88f, 195.88f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -135.76f, 0.0f)
                lineTo(195.88f, 60.12f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 195.88f, 195.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(65.78f, 65.77f)
                arcTo(88.08f, 88.08f, 0.0f, false, true, 184.3f, 60.39f)
                lineTo(60.38f, 184.31f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 5.4f, -118.54f)
                close()
                moveTo(190.22f, 190.23f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 71.7f, 195.61f)
                lineTo(195.62f, 71.69f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -5.4f, 118.54f)
                close()
            }
        }
        .build()
        return _circlehalftilt!!
    }

private var _circlehalftilt: ImageVector? = null
