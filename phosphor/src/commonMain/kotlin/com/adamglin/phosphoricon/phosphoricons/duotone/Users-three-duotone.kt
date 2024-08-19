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

public val DuotoneGroup.`Users-three-duotone`: ImageVector
    get() {
        if (`_users-three-duotone` != null) {
            return `_users-three-duotone`!!
        }
        `_users-three-duotone` = Builder(name = "Users-three-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 144.0f)
                close()
                moveTo(64.0f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 88.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 56.0f)
                close()
                moveTo(192.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 192.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.8f, 150.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.2f, -1.6f)
                arcTo(51.6f, 51.6f, 0.0f, false, false, 192.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -23.24f, -30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.5f, -4.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 219.0f, 117.51f)
                arcToRelative(67.94f, 67.94f, 0.0f, false, true, 27.43f, 21.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 244.8f, 150.4f)
                close()
                moveTo(190.92f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.85f, 8.0f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, -98.15f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.84f, -8.0f)
                arcToRelative(72.06f, 72.06f, 0.0f, false, true, 33.74f, -29.92f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 58.36f, 0.0f)
                arcTo(72.06f, 72.06f, 0.0f, false, true, 190.92f, 212.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 176.0f)
                close()
                moveTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 87.24f, 82.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.5f, -4.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 37.0f, 117.51f)
                arcTo(67.94f, 67.94f, 0.0f, false, false, 9.6f, 139.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, 9.61f)
                arcTo(51.6f, 51.6f, 0.0f, false, true, 64.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_users-three-duotone`!!
    }

private var `_users-three-duotone`: ImageVector? = null
