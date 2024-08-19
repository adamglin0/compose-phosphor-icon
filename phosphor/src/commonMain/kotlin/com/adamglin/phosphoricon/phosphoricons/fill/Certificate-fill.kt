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

public val FillGroup.`Certificate-fill`: ImageVector
    get() {
        if (`_certificate-fill` != null) {
            return `_certificate-fill`!!
        }
        `_certificate-fill` = Builder(name = "Certificate-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 86.53f)
                lineTo(232.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(160.0f, 200.0f)
                verticalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 172.0f, 231.0f)
                lineToRelative(24.0f, -13.74f)
                lineTo(220.0f, 231.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 224.0f)
                lineTo(232.0f, 161.47f)
                arcToRelative(51.88f, 51.88f, 0.0f, false, false, 0.0f, -74.94f)
                close()
                moveTo(128.0f, 144.0f)
                lineTo(72.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(128.0f, 112.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 210.21f)
                lineTo(200.0f, 201.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 0.0f)
                lineToRelative(-16.0f, 9.16f)
                lineTo(176.06f, 172.0f)
                arcToRelative(51.88f, 51.88f, 0.0f, false, false, 40.0f, 0.0f)
                close()
                moveTo(196.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 196.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_certificate-fill`!!
    }

private var `_certificate-fill`: ImageVector? = null
