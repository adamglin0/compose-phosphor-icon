package com.adamglin.phosphoricon.phosphoricons.duotone

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
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Compass-rose-duotone`: ImageVector
    get() {
        if (`_compass-rose-duotone` != null) {
            return `_compass-rose-duotone`!!
        }
        `_compass-rose-duotone` = Builder(name = "Compass-rose-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                lineToRelative(-96.0f, 24.0f)
                lineToRelative(-24.0f, 96.0f)
                lineToRelative(-24.0f, -96.0f)
                lineTo(8.0f, 128.0f)
                lineToRelative(96.0f, -24.0f)
                lineTo(128.0f, 8.0f)
                lineToRelative(24.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.94f, 120.24f)
                lineToRelative(-27.05f, -6.76f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, -80.37f)
                lineToRelative(-6.76f, -27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, 0.0f)
                lineToRelative(-6.76f, 27.05f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, -80.37f, 80.37f)
                lineToRelative(-27.0f, 6.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 15.52f)
                lineToRelative(27.05f, 6.76f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, 80.37f)
                lineToRelative(6.76f, 27.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.52f, 0.0f)
                lineToRelative(6.76f, -27.05f)
                arcToRelative(95.86f, 95.86f, 0.0f, false, false, 80.37f, -80.37f)
                lineToRelative(27.05f, -6.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.52f)
                close()
                moveTo(154.45f, 143.14f)
                lineTo(139.31f, 128.0f)
                lineToRelative(15.14f, -15.14f)
                lineTo(215.0f, 128.0f)
                close()
                moveTo(101.55f, 143.14f)
                lineTo(41.0f, 128.0f)
                lineToRelative(60.57f, -15.14f)
                lineTo(116.69f, 128.0f)
                close()
                moveTo(205.77f, 109.2f)
                lineTo(158.6f, 97.4f)
                lineTo(146.8f, 50.23f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 205.77f, 109.2f)
                close()
                moveTo(143.14f, 101.55f)
                lineTo(128.0f, 116.69f)
                lineToRelative(-15.14f, -15.14f)
                lineTo(128.0f, 41.0f)
                close()
                moveTo(109.2f, 50.23f)
                lineTo(97.4f, 97.4f)
                lineTo(50.23f, 109.2f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 109.2f, 50.23f)
                close()
                moveTo(50.2f, 146.8f)
                lineTo(97.4f, 158.6f)
                lineToRelative(11.8f, 47.17f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 50.23f, 146.8f)
                close()
                moveTo(112.83f, 154.45f)
                lineTo(128.0f, 139.31f)
                lineToRelative(15.14f, 15.14f)
                lineTo(128.0f, 215.0f)
                close()
                moveTo(146.77f, 205.77f)
                lineTo(158.57f, 158.6f)
                lineTo(205.74f, 146.8f)
                arcTo(79.88f, 79.88f, 0.0f, false, true, 146.8f, 205.77f)
                close()
            }
        }
        .build()
        return `_compass-rose-duotone`!!
    }

private var `_compass-rose-duotone`: ImageVector? = null
