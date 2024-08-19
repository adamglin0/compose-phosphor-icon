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

public val DuotoneGroup.`Hexagon-duotone`: ImageVector
    get() {
        if (`_hexagon-duotone` != null) {
            return `_hexagon-duotone`!!
        }
        `_hexagon-duotone` = Builder(name = "Hexagon-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.16f, 7.0f)
                lineToRelative(-88.0f, 48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.68f, 0.0f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.16f, -7.0f)
                verticalLineTo(80.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.16f, -7.0f)
                lineToRelative(88.0f, -48.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.68f, 0.0f)
                lineToRelative(88.0f, 48.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 80.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f)
                verticalLineTo(80.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f)
                close()
                moveTo(216.0f, 175.82f)
                lineTo(128.0f, 224.0f)
                lineTo(40.0f, 175.82f)
                verticalLineTo(80.18f)
                lineTo(128.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(88.0f, 48.17f)
                close()
            }
        }
        .build()
        return `_hexagon-duotone`!!
    }

private var `_hexagon-duotone`: ImageVector? = null
