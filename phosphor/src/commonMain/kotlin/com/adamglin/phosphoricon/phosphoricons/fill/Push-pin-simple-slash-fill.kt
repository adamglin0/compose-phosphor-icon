package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Push-pin-simple-slash-fill`: ImageVector
    get() {
        if (`_push-pin-simple-slash-fill` != null) {
            return `_push-pin-simple-slash-fill`!!
        }
        `_push-pin-simple-slash-fill` = Builder(name = "Push-pin-simple-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.25f, 38.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -6.69f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 191.73f, 48.0f)
                horizontalLineToRelative(-6.19f)
                lineTo(206.7f, 167.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.9f, 3.39f)
                close()
                moveTo(213.92f, 210.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(66.24f, 72.0f)
                lineTo(49.29f, 168.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(184.0f)
                horizontalLineToRelative(32.1f)
                lineToRelative(34.0f, 37.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return `_push-pin-simple-slash-fill`!!
    }

private var `_push-pin-simple-slash-fill`: ImageVector? = null
