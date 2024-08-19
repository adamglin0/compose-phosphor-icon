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

public val DuotoneGroup.Tennisball: ImageVector
    get() {
        if (_tennisball != null) {
            return _tennisball!!
        }
        _tennisball = Builder(name = "Tennisball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.12f, 60.09f)
                arcTo(95.74f, 95.74f, 0.0f, false, true, 127.83f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(95.94f, 95.94f, 0.0f, false, true, 32.0f, 127.75f)
                arcTo(95.64f, 95.64f, 0.0f, false, true, 60.12f, 60.09f)
                close()
                moveTo(32.0f, 127.92f)
                verticalLineToRelative(-0.17f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(156.28f, 156.18f)
                arcToRelative(95.54f, 95.54f, 0.0f, false, false, -28.11f, 67.65f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 128.08f)
                horizontalLineToRelative(0.0f)
                arcTo(95.79f, 95.79f, 0.0f, false, false, 156.28f, 156.18f)
                close()
                moveTo(128.17f, 224.0f)
                verticalLineToRelative(-0.17f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.57f, 54.46f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.08f)
                arcTo(103.4f, 103.4f, 0.0f, false, false, 201.57f, 54.46f)
                close()
                moveTo(65.75f, 65.77f)
                arcToRelative(87.63f, 87.63f, 0.0f, false, true, 53.66f, -25.31f)
                arcTo(87.31f, 87.31f, 0.0f, false, true, 94.0f, 94.06f)
                arcToRelative(87.42f, 87.42f, 0.0f, false, true, -53.62f, 25.35f)
                arcTo(87.58f, 87.58f, 0.0f, false, true, 65.75f, 65.77f)
                close()
                moveTo(40.33f, 135.48f)
                arcToRelative(103.29f, 103.29f, 0.0f, false, false, 65.0f, -30.11f)
                arcToRelative(103.24f, 103.24f, 0.0f, false, false, 30.13f, -65.0f)
                arcToRelative(87.78f, 87.78f, 0.0f, false, true, 80.18f, 80.14f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -95.16f, 95.1f)
                arcToRelative(87.78f, 87.78f, 0.0f, false, true, -80.18f, -80.14f)
                close()
                moveTo(190.25f, 190.23f)
                arcToRelative(87.69f, 87.69f, 0.0f, false, true, -53.66f, 25.31f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 79.0f, -78.95f)
                arcTo(87.58f, 87.58f, 0.0f, false, true, 190.25f, 190.23f)
                close()
            }
        }
        .build()
        return _tennisball!!
    }

private var _tennisball: ImageVector? = null
