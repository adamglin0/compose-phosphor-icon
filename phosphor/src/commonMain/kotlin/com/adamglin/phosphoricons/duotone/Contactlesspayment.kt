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

public val DuotoneGroup.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) {
            return _contactlessPayment!!
        }
        _contactlessPayment = Builder(name = "ContactlessPayment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
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
                moveTo(97.07f, 100.26f)
                arcToRelative(59.33f, 59.33f, 0.0f, false, true, 0.0f, 55.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.14f, -7.48f)
                arcToRelative(42.79f, 42.79f, 0.0f, false, false, 0.0f, -40.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.14f, -7.48f)
                close()
                moveTo(153.07f, 68.26f)
                arcToRelative(126.67f, 126.67f, 0.0f, false, true, 0.0f, 119.54f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 139.0f, 180.23f)
                arcToRelative(110.62f, 110.62f, 0.0f, false, false, 0.0f, -104.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.12f, -7.54f)
                close()
                moveTo(125.07f, 84.26f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, true, 0.0f, 87.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.12f, -7.52f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 0.0f, -72.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.12f, -7.52f)
                close()
            }
        }
        .build()
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
