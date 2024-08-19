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

public val DuotoneGroup.`Infinity-duotone`: ImageVector
    get() {
        if (`_infinity-duotone` != null) {
            return `_infinity-duotone`!!
        }
        `_infinity-duotone` = Builder(name = "Infinity-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(225.94f, 161.94f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -67.88f, 0.0f)
                lineTo(128.0f, 128.0f)
                lineToRelative(30.06f, -33.94f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.88f, 67.88f)
                close()
                moveTo(30.06f, 94.06f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 67.88f, 67.88f)
                lineTo(128.0f, 128.0f)
                lineTo(97.94f, 94.06f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 30.06f, 94.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -95.6f, 39.6f)
                lineToRelative(-0.33f, -0.35f)
                lineTo(92.12f, 99.55f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 56.9f)
                lineToRelative(8.52f, -9.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.61f)
                lineToRelative(-8.69f, 9.81f)
                lineToRelative(-0.33f, 0.35f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -79.2f)
                lineToRelative(0.33f, 0.35f)
                lineToRelative(59.95f, 67.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -56.9f)
                lineToRelative(-8.52f, 9.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.61f)
                lineToRelative(8.69f, -9.81f)
                lineToRelative(0.33f, -0.35f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_infinity-duotone`!!
    }

private var `_infinity-duotone`: ImageVector? = null
