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

public val DuotoneGroup.`Nut-duotone`: ImageVector
    get() {
        if (`_nut-duotone` != null) {
            return `_nut-duotone`!!
        }
        `_nut-duotone` = Builder(name = "Nut-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(219.84f, 73.16f)
                lineTo(131.84f, 25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.68f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.16f, 7.0f)
                verticalLineToRelative(95.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.16f, 7.0f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.68f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.16f, -7.0f)
                verticalLineTo(80.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 219.84f, 73.16f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.06f, 48.06f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(223.68f, 66.15f)
                lineTo(135.68f, 18.0f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -15.36f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.32f, 14.0f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f)
                lineTo(232.0f, 80.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f)
                close()
                moveTo(128.0f, 224.0f)
                lineTo(40.0f, 175.82f)
                lineTo(40.0f, 80.18f)
                lineTo(128.0f, 32.0f)
                lineToRelative(88.0f, 48.17f)
                verticalLineToRelative(95.63f)
                close()
            }
        }
        .build()
        return `_nut-duotone`!!
    }

private var `_nut-duotone`: ImageVector? = null
